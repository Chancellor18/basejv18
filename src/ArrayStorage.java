import java.util.Arrays;

public class ArrayStorage {

    private Resume[] storage = new Resume[10000];
    private int sizeOfResume = 0;

    void clear() {
        for (int i = 0; i < sizeOfResume; i++) {
            storage[i] = null;
        }
        sizeOfResume = 0;
    }

    void save(Resume r) {
        for (int i = 0; i < sizeOfResume; i++) {
            if (storage[i].uuid.equals(r.uuid)) {
                System.out.println("Resume" + r.uuid + " Putted");
                return;
            }
        }
        if (sizeOfResume < storage.length) {
            storage[sizeOfResume] = r;
            sizeOfResume++;
            return;
        }
        if (sizeOfResume == storage.length) {
            System.out.println("Full Arrays");
            return;
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < sizeOfResume; i++) {
            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < sizeOfResume; i++) {
            if (storage[i].uuid.equals(uuid)) {
                storage[i] = storage[sizeOfResume - 1];
                storage[sizeOfResume - 1] = null;
                sizeOfResume--;
                return;
            }
        }
        System.out.println("Resume" + uuid + " There is no have");
    }

    Resume[] getAll() { // Моментальный возврат
        return Arrays.copyOfRange(storage, 0, sizeOfResume);
    }

    int size() {
        return sizeOfResume;
    }
}

