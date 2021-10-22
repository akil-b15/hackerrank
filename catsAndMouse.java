static String catAndMouse(int x, int y, int z) {
        int a = Math.abs(z-x);
        int b = Math.abs(z-y);
        String s = "";
        if(a<b){
            s = "Cat A" ;
            return s;
        }else if(b<a){
            s = "Cat B"; 
            return s;
        }else{
            s = "Mouse C"; 
            return s;
        }

    }