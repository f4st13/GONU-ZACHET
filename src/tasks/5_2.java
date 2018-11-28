package tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _5_2 {

    void t6 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");

        for (int i=0; i<strAr.length-1; i+=2) {
            System.out.println(strAr[i]);
        }
    }

    void t7 () {
        String str = null, str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str = br.readLine();
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");

        for (int i=0; i<strAr.length; i++) {
            if ((Integer.parseInt(strAr[i]) & 1) == 0) {
                System.out.println(strAr[i]);
            }
        }
    }

    void t8 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");

        int c =0;
        for (int i =0; i<strAr.length; i++) {
            if (Integer.parseInt(strAr[i]) > 0) {
                ++c;
            }
        }
        System.out.println(c);
    }

    void t9 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");
        int[] ar = new int[strAr.length];
        for (int i=0; i<ar.length-1; i++) {
            ar[i] = Integer.parseInt(strAr[i]);
        }
        int c =0;
        for (int i=1; i<ar.length-1; i++) {
            if (ar[i] > ar[i-1]) {
                ++c;
            }
        }
        System.out.println(c);
    }

    void t10 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");
        int[] ar = new int[strAr.length];
        for (int i=0; i<ar.length-1; i++) {
            ar[i] = Integer.parseInt(strAr[i]);
        }
        if (ar.length == 1) {
            return;
        }
        for (int i =1; i<ar.length-1; i++) {
            if (((ar[i] < 0) & (ar[i-1] < 0)) ||  ((ar[i] > 0) & (ar[i-1] > 0))) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    void t11 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");
        int[] ar = new int[strAr.length];
        for (int i=0; i<ar.length-1; i++) {
            ar[i] = Integer.parseInt(strAr[i]);
        }
        int c =0;
        if (ar.length == 1) {
            return;
        }
        for (int i = 1; i < ar.length - 1; i++) {
            if ((ar[i] > ar[i-1]) & (ar[i] > ar[i+1])) {
                ++c;
            }
        }
        System.out.println(c);
    }

    void t12 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");
        for (int i =0; i< (strAr.length-1)/2; i++) {
            str2 = strAr[i];
            strAr[i] = strAr[strAr.length-i -1];
            strAr[strAr.length-i -1] = str2;
        }
        for (String s: strAr) {
            System.out.println(s);
        }
    }

    void t13 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");
        for (int i=0; i<=strAr.length-2; i+=2) {
            str2 = strAr[i+1];
            strAr[i+1] = strAr[i];
            strAr[i] = str2;
            System.out.println(strAr[i]);
            System.out.println(strAr[i+1]);
        }
        if ((strAr.length & 1) == 1) {
            System.out.println(strAr[strAr.length-1]);
        }
    }

    void t14 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");
        String str = strAr[strAr.length-1];
        for (int i=strAr.length-1; i>0; i--) {
            strAr[i] = strAr[i-1];
        }
        strAr[0] = str;
        for (String s: strAr) {
            System.out.println(s);
        }
    }

    void t15 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");
        int max = Integer.MIN_VALUE;
        for (int i=0; i<=strAr.length-1; i++) {
            if (max < Integer.parseInt(strAr[i])) {
                max = Integer.parseInt(strAr[i]);
            }
        }
        System.out.println(max);
    }

    void t16 () {
        String str2 = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            str2 = br.readLine();
        } catch (Exception e) {
        }
        String[] strAr = str2.split(" ");
        ArrayList<String> list = new ArrayList<>();
        int counter =0;
        for (int i=0; i<strAr.length-1; i++) {
            if (!(list.contains(strAr[i]))) {
                list.add(strAr[i]);
            }
        }
        System.out.println(list.size()+1);
    }

}