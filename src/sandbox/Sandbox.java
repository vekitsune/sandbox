/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

/**
 *
 * @author Verosffy
 */
public class Sandbox {

    /**
     * @param args the command line arguments
     */
    public static long atlagTombbol(int[] halmaz) {
        long avg = 0;
        long osszeg = 0;
        for (int i : halmaz) {
            osszeg += i;
        }
        avg = osszeg / halmaz.length;
        return avg;
    }

    public static String mindenMasodikSzo(String[] szavak) {
        String result = "alap";
        StringBuilder sb = new StringBuilder();;
        for (int i = 1; i < szavak.length; i += 2) {

            result += szavak[i];

            sb.append(szavak[i] + " ");
        }

        result = sb.toString();
        return result;
    }

    public static boolean azonosStringek(String[] egyik, String[] masik) {
        boolean result = false;
        if (egyik.length == masik.length) {
            result = true;
            for (int i = 0; i < egyik.length; i++) {
                if (!egyik[i].equals(masik[i])) {
                    result = false;
                }
            }

        }

        return result;
    }
    public static int masodikLegnagyobb(int[]alany){
        int legnagyobb;
        int masodikLegnagyobb;
        int index=0;
        legnagyobb=alany[0]<alany[1]?alany[1]:alany[0];
        masodikLegnagyobb=alany[0]<alany[1]?alany[0]:alany[1];
        for (int i = 2; i < alany.length; i++) {
            if(alany[i]>legnagyobb){
                masodikLegnagyobb=legnagyobb;
                legnagyobb=alany[i];
            }else if(alany[i]>masodikLegnagyobb){
                masodikLegnagyobb=alany[i];
            }
        }
        
        return masodikLegnagyobb;
    }
    
    public static int masodikLegnagyobbIndexe(int [] alany){
        //nem tisztázott lehet e ismétlődés a tömbben 
        //és két legnagyobb esetén a második legnagyobbnak számít e az egyik legnagyobb vagy sem.
        int indmax;
        int indmax2;
        if(alany[0]<alany[1]){
            indmax=1;
            indmax2=0;
        }else{
            indmax=0;
            indmax2=1;
        }
        for (int i = 2; i < alany.length; i++) {
            if(alany[i]>alany[indmax]){
                indmax2=indmax;
                indmax=i;
            }else if(alany[i]>alany[indmax2]){
                indmax2=i;
                
            }
        }
        
        return indmax2;
    }
    
    public static int[][] maxokMatrixban(int[][]egyik, int[][]masik){
        
        
        
        return egyik;
    }

    public static void main(String[] args) {
        String[] szavak = {"Kacsalábon", "forgó", "kastéályt", "szeretnék", "MOST", "házikót"};
        System.out.println(mindenMasodikSzo(szavak));
        String[] szavakkk={"Kacsalábon", "forgó", "kastéályt", "szeretnék", "MOST", "házkót"};
        System.out.println(azonosStringek(szavakkk, szavak));
        int[]prat={19,8,7,6,5,4,3,2,1};
        System.out.println(masodikLegnagyobb(prat));
    }

}
