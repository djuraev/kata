package dstructure;

public class GenArrayList<T> {
    //
    private T[] container;
    private int currentSize;
    private int currentIndex;
    private int times=0;

    public GenArrayList() {
        //
        this.currentSize = 10;
        this.container = (T[]) new Object[currentSize];
        this.currentIndex = 0;
    }

    public GenArrayList(int initialSize) {
        //
        this.currentSize = initialSize;
        this.container = (T[]) new Object[initialSize];
        this.currentIndex = 0;
    }

    public static <T> GenArrayList newInstance() {
        //
        return new GenArrayList<T>();
    }

    private void resizeToDouble() {
        //
        this.currentSize *= 2;
        T[] newContainer = (T[]) new Object[this.currentSize];
        this.copyArray(this.container, newContainer);
        this.container = newContainer;
        System.out.println("Array has been resized: "+(times++) + ". Current size: "+this.currentSize);
    }

    private void copyArray(T[] source, T[] destination) {
        //
        int sourceLength = source.length;
        for (int index=0; index < sourceLength; index++) {
            destination[index] = source[index];
        }
    }

    public boolean add(T element) {
        //
        this.container[this.currentIndex] = element;
        this.currentIndex++;
        float loadRatio = (this.currentIndex / this.currentSize);
        float loadFactor = 0.8f;
        if (loadRatio >= loadFactor) {
            this.resizeToDouble();
        }
        return true;
    }

    public void printContent() {
        //
        int index = 0;
        while (index < this.currentIndex) {
            System.out.println(this.container[index]);
            index++;
        }
    }

    public void clear() {
        //
        for (int index=0; index<this.currentIndex; index++) {
            this.container[index] = null;
        }
        this.currentIndex = 0;
    }

    public boolean contains(T element) {
        //
        for (T e: this.container) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        //
        if (index < 0 || index >= this.currentIndex) {
            throw new IndexOutOfBoundsException("Index is bigger than size of list.");
        }
        return this.container[index];
    }

    public int size() {
        //
        return this.currentIndex;
    }

    public boolean isEmpty() {
        //
        return this.currentIndex == 0;
    }

    private void moveToRight(int startIndex, int place) {
        //TODO
        if (startIndex < 0 || startIndex >= currentIndex) {
            throw new IndexOutOfBoundsException();
        }
    }

    public T delete(int index) {
        //
        if (index < 0 || index >= currentIndex) {
            throw new IndexOutOfBoundsException();
        }
        int i = index;
        T result = this.container[i];
        while (i < currentIndex-1) {
            this.container[i] = container[i+1];
            i++;
        }
        this.currentIndex--;
        this.currentSize--;
        return result;
    }

    public void addAt(int index, T value) {
        //
        if (index < 0 || index > this.currentIndex) {
            throw new IndexOutOfBoundsException();
        }
        int currPtr = currentIndex-1;
        while (currPtr >= index) {
            container[currPtr+1] = container[currPtr];
            currPtr--;
        }
        container[index] = value;
        currentIndex++;
    }

    public T set(int index, T value) {
        //
        if (index < 0 || index > currentIndex) {
            throw new IndexOutOfBoundsException();
        }
        this.container[index] = value;
        return container[index];
    }
}
