static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int count = 0;
        Arrays.sort(keyboards);
        Arrays.sort(drives);
        int k = keyboards.length;
        int d = drives.length;
        if(keyboards[0]+drives[0]>b){
            return -1;
        }else{
            for(int i=k-1; i>=0; i--){
                for(int j=d-1; j>=0; j--){
                    if(keyboards[i]+drives[j] <= b && keyboards[i]+drives[j]>count){
                        count = keyboards[i]+drives[j];
                    }
                }
            }
            return count;
        }
    }