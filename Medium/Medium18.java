class Medium18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> subarrays = new HashSet<List<Integer>>();
        findCombinations(nums,target,0,4,subarrays,new ArrayList<Integer>());
        List<List<Integer>> result = new ArrayList<List<Integer>>(subarrays);
        return result;

    }

    public void findCombinations(int[] A, int target, int i, int k, Set<List<Integer>> subarrays, List<Integer> out) {
        if (A.length == 0 || k > A.length) {
            return;
        }

        if (k == 0) {
            int sum = 0;
            for (Integer a : out)
                sum += a;
            if (sum == target)
                subarrays.add(new ArrayList<Integer>(out));
            return;
        }

        for (int j = i; j < A.length; j++) {
            out.add(A[j]);
            findCombinations(A, target, j + 1, k - 1, subarrays, out);
            out.remove(out.size() - 1);
        }
    }
}