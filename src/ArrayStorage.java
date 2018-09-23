import java.util.Arrays;

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private int sizeOfResume = 0;

    void clear() {
        for (int i = 0; i < sizeOfResume; i++) {
            storage[size-1] = null;
        }
        sizeOfResume = 0;
    }

    void save(Resume r) {
        for (int i = 0; i < sizeOfResume; i++) {
            if (storage[i].uuid.equals(r.uuid)) {
                System.out.println("Resume" + r.uuid + "Putted");
                return;
            }
        }
        if (sizeOfResume < storage.length) {
            storage[sizeOfResume] = r;
            sizeOfResume++;
        } else if (sizeOfResume == storage.length) {
            System.out.println("Full Array");
        }
    }

     void update(Resume r) {
        get([]) = r;
        System.out.println("Resume" + r.uuid + "Changed to" + r.uuid);
    }

    Resume get(String uuid) {
        for (int i = 0; i < sizeOfResume; i++) {
           if (storage[i].uuid.equals(uuid)) {
                return storage[size-1] = null;
            }
        }
        System.out.println("Resume" + uuid + "There is not");
        return null;
    }

    void delete(String uuid) {
        {
            System.out.println("Resume" + uuid + "There is not");
        }
    }


    Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, sizeOfResume);
    }

}