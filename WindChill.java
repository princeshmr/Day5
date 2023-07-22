class WindChill{
         public static void main(String args[]){

                 double t=Double.parseDouble(args[0]);//temp
                 double v=Double.parseDouble(args[1]);// wind speed
                 
                 if(t<=50 && v>=3 && v<=120){
                        double windchill=35.74 +0.6215 * t +(0.4275 * t - 35.75) * Math.pow(v,0.16); 
                        System.out.println("THe Wind Chill is "+windchill);  
                 } 
                 else{
                       System.out.println("The wind chill formula is not valid"); 
                 }      
         }

}