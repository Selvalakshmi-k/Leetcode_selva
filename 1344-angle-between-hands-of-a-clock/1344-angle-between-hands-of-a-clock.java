class Solution {
    public double angleClock(int hour, int minutes) {
        double m_h=minutes*6;
        double h_h=((hour%12)*30)+((0.5)*minutes);
        double diff=Math.abs(h_h-m_h);
        return Math.min(diff,360-diff);

    }
}