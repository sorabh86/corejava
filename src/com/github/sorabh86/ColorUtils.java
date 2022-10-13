/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sorabh86;

/**
 *
 * @author Sorabh86 <ssorabh.ssharma@gmail.com>
 */
public class ColorUtils {
    private static final char[] HEX_BASE = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    public static int randomIndex() {
        return (int) Math.round(Math.random()*HEX_BASE.length);
    }   
    public static String getRandomColor() {
        String str = "#";
        
        for (int i = 0; i < 6; i++) {
            str += HEX_BASE[randomIndex()];
        }
        
        return str;
    }
    public static String invertColor(String hex) {
        if(hex.indexOf('#')==0) {
            hex = hex.substring(1,hex.length());
        }
        System.out.println(hex);
        
        // 3 digit hexcode
        if(hex.length() == 3) {
            hex = new StringBuilder()
                    .append(hex.charAt(0)).append(hex.charAt(0))
                    .append(hex.charAt(1)).append(hex.charAt(1))
                    .append(hex.charAt(2)).append(hex.charAt(2)).toString();
        }
        
        System.out.println(hex);
        if(hex.length() != 6) {
            System.out.println("Not a valid Hexcode");
        }
        // invert color
        int ri = 255 - Integer.valueOf(hex.substring(0,2), 16);
        String r = Integer.toString(ri, 16);
        if(r.length()==1) r = '0'+r;
        int gi = 255 - Integer.valueOf(hex.substring(2,4), 16);
        String g = Integer.toString(gi, 16);
        if(g.length()==1) g = '0'+g;
        int bi = 255 - Integer.valueOf(hex.substring(4,6), 16);
        String b = Integer.toString(bi, 16);
        if(b.length()==1) b = '0'+b;
        
        String invertedColor = '#'+(ri+""+gi+""+bi);
        
        return invertedColor;
    }
}
