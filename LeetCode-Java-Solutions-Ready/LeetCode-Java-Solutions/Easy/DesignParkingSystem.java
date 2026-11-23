// LeetCode 1603 - Design Parking System
// Approach: Store the number of available spaces for each car type.

class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big--;
            return true;
        } else if (carType == 2 && medium > 0) {
            medium--;
            return true;
        } else if (carType == 3 && small > 0) {
            small--;
            return true;
        }

        return false;
    }
}

// Time Complexity: O(1) for addCar - only a few conditions are checked.
// Space Complexity: O(1) - three counters are stored.
