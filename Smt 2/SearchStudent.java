public class SearchStudent {
    
    Students[] listStd;
    int idx;

    public SearchStudent(int size){
        listStd = new Students[size];
        idx = 0;

    }

    public void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students students : listStd) {
            students.display();
            System.out.println("--------------------------------");
        }
    }

    public int findSeqSearch(String search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].name.equals(search)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(String name, int pos) { 
        if (pos != -1) {
            System.out.println("Data with name \"" + name + "\" is found at index " + pos);
        } else {
            System.out.println("Data with name \"" + name + "\" is not found");
        }
    }
    public void showData(String name, int pos) { 
        if (pos != -1) {
            System.out.println("Name \t : " + name);
            System.out.println("NIM \t : " + listStd[pos].nim);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("IPK \t : " + listStd[pos].gpa);
        } else {
            System.out.println("Data with name \"" + name + "\" is not found");
        }
    }

    public int findBinarySearch(String cari, int left, int right) {
        sort();
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            int comparisonResult = cari.compareTo(listStd[mid].name);
            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    private void sort() {
        for (int i = 0; i < listStd.length - 1; i++) {
        for (int j = 0; j < listStd.length - i - 1; j++) {
            if (listStd[j].name.compareTo(listStd[j+1].name) > 0) {
                Students temp = listStd[j];
                listStd[j] = listStd[j+1];
                listStd[j+1] = temp;
            }
        }
    }
}

public int[] findInArr2D(int search, int[][] arr2d) {
    for (int i = 0; i < arr2d.length; i++) {
        for (int j = 0; j < arr2d[i].length; j++) {
            if (arr2d[i][j] == search) return new int[]{i, j};
         }
    }
    return null;
}
}