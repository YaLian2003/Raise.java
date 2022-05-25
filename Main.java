public class Main
{
        public static void main(String[] args) {
            // array size
            int n = 5;
            
            // create array of StandingDesk type
                StandingDesk[] arr = new StandingDesk[n];
                
                // entering values for 'arr'
                for(int i = 0; i < n; i++){
                    arr[i] = new StandingDesk(i*2);
                }
                
                // calling raiseAllDesksToHighest()
                raiseAllDesksToHighest(arr);
                
        }
        
        // method to modify all array values to be of max desk height
        public static void raiseAllDesksToHighest(StandingDesk[] arr){
            // Since array is null or array is empty, so do nothing 
            if(arr == null || arr.length == 0){}
            
            // array isn't empty
            else{
                
                // variable to store max desk height in array
                int maxHeight = 0;
                
            for(int i = 0; i < arr.length; i++){
                // found larger value than maxHeight
                if(maxHeight < arr[i].deskHeight)
                    // update maxHeight
                    maxHeight = arr[i].deskHeight;
            }
            
            // print array before modification
            System.out.println("\narray before modification:");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i].deskHeight + " ");
            }
            
            // modify array values
            for(int i = 0; i < arr.length; i++){
                arr[i].deskHeight = maxHeight;
            }
            
            // print array after modification
            System.out.println("\narray after modification:");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i].deskHeight + " ");
            }
            }
            
        }
}
