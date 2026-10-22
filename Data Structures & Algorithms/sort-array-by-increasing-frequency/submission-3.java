class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (int x : nums) {
        // .getOrDefault, this attemps to get the current freq of the 
        // number within the map if there is none
        // or its the maps first time seeing the number than it 
        // defaults to 0 and afterwards increments by 1
            counts.put(x, counts.getOrDefault(x, 0) + 1);
        }

        // creates an array to use the compare function?
        List<Integer> list = new ArrayList<>();
        for (int x : nums) {
            list.add(x);
        }
 
        // this is the part I dont understand
        list.sort((a, b) -> {

            // think about these as added on attributes to the numbers already being compared
            // which is why we check the frequncy first and not the values
            // these are not seperate numbers being compared 
            // rather the frequencys of the numbers chosen by the sort algorithim being compared
            int fa = counts.get(a); 
            // since we have the int value being the key, the value that is returened
            // is the frequency value
            int fb = counts.get(b);
            // same thing here

            if (fa != fb) {
                return Integer.compare(fa, fb); 
                // compare fa to fb
                // if fa < fb 
                // it returns a negative which means that 
                // a ( the number should go first) should go first
                // this is comparing the frequency

            }
            return Integer.compare(b, a); 
            // this is after comparing the frequency,
            // if the two numbers already have the same frequency then we go into comparning
            // whether then numbers are bigger than one another
            // since this leet code is asking in descending order we would want
            // the larger number to to go first so we have (b,a) but if 
            // we wanted thme in descending order we would do (a,b)
    
        });

        // since we have to return the sorted list as a normal array
        // we just easily set up a result array with the length of the original array we
        // were given and then for the size of the list which should be the same size as the array
        // we add the new sorted values
 
        int[] result = new int[nums.length];

        for (int i = 0; i < list.size(); i++) {
        result[i] = list.get(i);
        }

        return result;
    }
        
    }
