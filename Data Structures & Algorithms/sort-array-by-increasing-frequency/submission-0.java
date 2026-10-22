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
            int fa = counts.get(a); 
            // since we have the int value being the key, the value that is returened
            // is the frequency value
            int fb = counts.get(b);
            // same thing here

            if (fa != fb) {
                return Integer.compare(fa, fb); // lower frequency first
            }
            return Integer.compare(b, a);       // tie: smaller value first
        });
 
        int[] result = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
        result[i] = list.get(i);
        }
        return result;
    }
        
    }
