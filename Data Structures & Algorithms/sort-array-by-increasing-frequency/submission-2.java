class Solution {
    public int[] frequencySort(int[] nums) {
    
    Map<Integer,Integer> c = new HashMap<>();

    for(int x : nums){
        c.put(x, c.getOrDefault(x,0) + 1);
    }


    List<Integer> list = new ArrayList<>();

    for(int x : nums){
        list.add(x);
    }

    list.sort((a,b) -> {
    
    int fa = c.get(a);
    int fb = c.get(b);


    if(fa != fb){
        return Integer.compare(fa,fb);
    } else {
        return Integer.compare(b,a);
    }


    });




    int[] result = new int[nums.length];

    for(int i = 0; i < nums.length; i ++){
        result[i] = list.get(i);
    }

    return result;
        
    }
}