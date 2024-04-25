package windows11;

import java.io.*;

import java.io.*;

public class DeviceList {
    public static void main(String[] args) {
        try {
            // Command to list network devices
            String command = "cmd.exe /c ipconfig /all";
            Process cmdProcess = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(cmdProcess.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

