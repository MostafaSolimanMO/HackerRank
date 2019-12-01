package DaysOfCode;

public class Day14_Scope {

    class Difference {
        public int maximumDifference;
        private int[] elements;

        // Add your code here
        Difference(int[] elements) {
            this.elements = elements;
        }

        public void computeDifference() {

            int minEle = elements[0];
            int maxEle = elements[0];
            for (int i = 1; i < elements.length; i++) {
                minEle = Math.min(minEle, elements[i]);
                maxEle = Math.max(maxEle, elements[i]);
            }
            this.maximumDifference = (maxEle - minEle);
        }

    }
}
