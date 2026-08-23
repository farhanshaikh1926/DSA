class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totalFloors = 0;
        int currentFloor = 0; 

        for (int i = 0; i < requests.length; i++) {
            totalFloors += Math.abs(requests[i] - currentFloor);
            currentFloor = requests[i];
        }

        return totalFloors;
    }
}