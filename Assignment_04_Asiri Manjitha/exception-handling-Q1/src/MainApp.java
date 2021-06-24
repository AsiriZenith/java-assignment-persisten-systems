import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainApp {

    private static final String path = "D:\\programme\\java programme\\Assignment\\java-assignment-persisten-systems\\Assignment_04_Asiri Manjitha\\movies.txt";

    public static void main(String[] args) {
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while (strLine != null)
            {
                if (strLine == null)
                    break;
                str_data = str_data + "#" + strLine;
                strLine = br.readLine();
            }
            br.close();

            String[] arr = str_data.split("#");
            String[] strArr = new String[arr.length-2];

            int i=0;
            for(String s : arr) {
                if(s != null && s.length() > 0) {
                    strArr[i] = s;
                    i++;
                }
            }

            for (String s : strArr) {
                try {
                    Stack.push(contactObjectCreator(s));
                } catch (Exception e) {
                    System.out.println("an error occurred while pushing into the stack!!");
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Contact contactObjectCreator(String s) {
        String[] arr = s.split(",");
        Contact contact = new Contact();
        for (int i = 0; i < arr.length; i++) {
            switch (i) {
                case 1:
                    contact.setFirstName(arr[i]);
                    break;
                case 2:
                    contact.setMiddleName(arr[i]);
                    break;
                case 3:
                    contact.setLastName(arr[i]);
                    break;
                case 4:
                    contact.setDob(arr[i]);
                    break;
                case 5:
                    contact.setGender(arr[i]);
                    break;
                case 6:
                    contact.setAnniversary(arr[i]);
                    break;
                case 7:
                    contact.setArea(arr[i]);
                    break;
                case 8:
                    contact.setCity(arr[i]);
                    break;
                case 9:
                    contact.setPinCode(arr[i]);
                    break;
                case 10:
                    contact.setState(arr[i]);
                    break;
                case 11:
                    contact.setCountry(arr[i]);
                    break;
                case 12:
                    contact.setTelNumber(arr[i]);
                    break;
                case 13:
                    contact.setMobNumber(arr[i]);
                    break;
                case 14:
                    contact.setEmail(arr[i]);
                    break;
                case 15:
                    contact.setWebsite(arr[i]);
                    break;
                default:
                    System.out.println("An Invalid format detected!!");
                    return null;
            }
        }
        return contact;
    }
}