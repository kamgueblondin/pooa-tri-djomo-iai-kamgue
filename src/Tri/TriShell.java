/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tri;

/**
 *
 * @author Blondin
 */
class TriShell {

    public Long l[];

    public void printArray(Long arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int sort(Long arr[]) {
        int n = arr.length;
        Long temp = null;
        int retu = 0;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i += 1) {

                temp = arr[i];

                int j;
                try {
                    for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                        arr[j] = arr[j - gap];
                    }

                    arr[j] = temp;
                } catch (NullPointerException np) {
                }

            }
        }
        retu = arr[0].intValue();
        l = arr;
        return retu;
    }
}
