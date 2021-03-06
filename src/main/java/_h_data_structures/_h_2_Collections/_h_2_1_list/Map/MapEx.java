package _h_data_structures._h_2_Collections._h_2_1_list.Map;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> employees = new TreeMap<>();
        Map<Integer, String> employeesDraft = new HashMap<>();
        boolean isMapEmpty = employees.isEmpty();
        employees.put(11, "Dorota Miler");
        employees.put(22, "Reggie Tyler");
        employees.put(66, "Dennis Pommn");
        employees.put(55, "Goerge Fillis");
        employees.put(44, "Dorota Miler");
        employees.put(33, "Thomas Key");

        employees.putAll(employeesDraft);

        System.out.println("Number of all employees: " + employees.size());
        System.out.println("22nd eployee on the list is: " + employees.get(22));
        System.out.println("Is the employees map empty: " + isMapEmpty);
        Collection<String> employeesNames = employees.values();
        System.out.println("Here is a range of values whoch map containts: " + employeesNames);
        System.out.println("Does map contain value 'Dennis Pommn' " + employees.containsValue("Dennis Pommn"));
        System.out.println("Is there in a map key: 44: " + employees.containsKey(44));
        Set<Integer> keySet = employees.keySet();
        System.out.println("Keys: " + keySet);
        employees.remove(22);
        System.out.println("Employees list size after 22nd key removal: "+employees.size());

        System.out.println("Here are all records that employees map holds: ";
        printEntrySet();
    }

    public int printValues(Map employees){
        for(var employee: employees){
            System.out.println(employee);
        }

    }

    public static void printEntrySet() {
        // records display in a set(ordered manner): key-value
        Set<Map.Entry<Integer, String>> entrySet = employees.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}