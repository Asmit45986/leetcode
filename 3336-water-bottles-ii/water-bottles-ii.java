class Solution {
    public int maxBottlesDrunk(int nb, int ex) {
        int sum = nb;
        while (nb >= ex) {
            nb -= ex-1;
            ex++;
            sum++;
        }
        return sum;
    }
}