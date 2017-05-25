/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diffdata;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Win7
 */
public class DiffData {

    /**
     * Este programa serve para calcular a diferença de dias entre duas datas
     * A variável strInicio recebe a data inicial, enquanto que a variável
     * strFim recebe a data final.
     * Este código utiliza cálculo matemático para calcular a diferença de datas.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Data inicial: ");
        String strInicio = ler.nextLine();
        System.out.println("Data final:");
        String strFim=ler.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yy");
        try {
            Date d,a,a1,d1;
            DateFormat dt = DateFormat.getDateInstance();
            DateFormat dt2 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
            d1=dt2.parse(strInicio);
            a1=dt2.parse(strFim);
                        
            //Duas formas de calcular:
            //Este trecho é mais correto, porque ele propaga menos erro do que o outro, por exemplo: 
            //faça strInicio = 01/01/0000 e strFim = 12/05/2017. Este trecho calculará corretamente
            //O de baixo calculará uma dia a mais.
            long a4 = (a1.getTime()/(60*60*24*1000)) - (d1.getTime()/(60*60*24*1000));
            System.out.println("Result: "+Math.abs(a4));
            
            //Este propaga mais erro:
            long a3 = a1.getTime() - d1.getTime();
            Calendar b1 = Calendar.getInstance();
            b1.setTimeInMillis(a3);
            System.out.println("Result: "+Math.abs(b1.getTimeInMillis()/(60*60*24*1000)));
            /*Estes trechos também são funcionais, porém são mais complicados e alguns não atendem totalmente
            d = dt.parse(strInicio);
            a = dt.parse(strFim);
            long a2 = a.getTime()-d.getTime();
            Calendar b = Calendar.getInstance();
            b.setTimeInMillis(a2);
            System.out.println("Result: "+Math.abs(b.getTimeInMillis()/(60*60*24*1000)));
            
            System.out.println("Result: "+d.getTime());
            Calendar e = Calendar.getInstance();
            Calendar f = Calendar.getInstance();
            int dia=Integer.parseInt(strInicio.substring(0, 1));
            int mes=Integer.parseInt(strInicio.substring(3, 4));
            int ano=Integer.parseInt(strInicio.substring(6, 9));
            e.set(Calendar.DAY_OF_MONTH, dia);
            e.set(Calendar.MONTH, mes);
            e.set(Calendar.YEAR, ano);
            dia=Integer.parseInt(strFim.substring(0, 1));
            mes=Integer.parseInt(strFim.substring(3, 4));
            ano=Integer.parseInt(strFim.substring(6, 9));
            f.set(Calendar.DAY_OF_MONTH, dia);
            f.set(Calendar.MONTH, mes);
            f.set(Calendar.YEAR, ano);
            long l = e.getTimeInMillis() - f.getTimeInMillis();
            e.setTimeInMillis(l);
            System.out.println("Diferença: "+e.get(Calendar.DAY_OF_MONTH));*/
            /*strFim.substring(3, 4);
            
            Date dtEntrada = new Date(formatter.parse(strInicio).getTime());
            Date dtSaida = new Date(formatter.parse(strFim).getTime());
            Calendar c = Calendar.getInstance();
            long l = dtSaida.getTime() - dtEntrada.getTime();
            c.setTimeInMillis(l);
            System.out.println("Diferença: "+ c.get(Calendar.DAY_OF_MONTH));*/
        } catch (Exception ex) {
            System.out.println("Erro: "+ex.toString());
        }
        Calendar cl;
        
        if(strInicio.equals("22/01/1987")){
            
        }
    }
    
}
