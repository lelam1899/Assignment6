package Assignment6;

import java.util.ArrayList;

public class PhoneBook  implements    Phone{

    public ArrayList<DataPhone> PhoneList;
    public PhoneBook() {
        PhoneList = new ArrayList<DataPhone>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (int i = 0; i < PhoneList.size(); i++) {
            if(PhoneList.get(i).name.compareTo(name) == 0) {
                PhoneList.get(i).phone += " : " + phone;
                return;
            }
        }
        PhoneList.add(new DataPhone(name, phone));

    }

    @Override
    public void removePhone(String name) {
        for(int i = 0; i < PhoneList.size(); i++) {
            if(PhoneList.get(i).name.compareTo(name) == 0) {
                PhoneList.remove(i);
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for(int i = 0; i < PhoneList.size(); i++) {
            if(PhoneList.get(i).name.compareTo(name) == 0) {
                System.out.println(name + ": " + PhoneList.get(i).phone);
            }
        }
    }

    @Override
    public void updatePhone(String name, String newPhone) {
        for(int i = 0; i < PhoneList.size(); i++) {
            if(PhoneList.get(i).name.compareTo(name) == 0) {
               PhoneList.get(i).phone = newPhone;
               return;
            }
        }
        insertPhone(name, newPhone);
    }

    @Override
    public void sort() {
        for(int i = 0; i < PhoneList.size(); i++) {
            for(int j = i + 1; j < PhoneList.size(); j++) {
                int length = Math.min(PhoneList.get(i).name.length(), PhoneList.get(j).name.length());
                for(int k = 0; k < length; k++) {
                    if(PhoneList.get(i).name.charAt(k) < PhoneList.get(j).name.charAt(k)) {
                        break;
                    } else if (PhoneList.get(i).name.charAt(k) > PhoneList.get(j).name.charAt(k)) {
                        String str1 = PhoneList.get(i).name;
                        String str2 = PhoneList.get(i).phone;
                        PhoneList.get(i).name = PhoneList.get(j).name;
                        PhoneList.get(i).phone = PhoneList.get(j).phone;
                        PhoneList.get(j).name = str1;
                        PhoneList.get(j).phone = str2;

                        break;
                    }

                }
            }
        }
    }
    public void showAllPhone() {
        for (int i = 0; i < PhoneList.size(); i++) {
            System.out.println(PhoneList.get(i).name + ": "
            + PhoneList.get(i).phone);
        }
    }

}
