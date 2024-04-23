package by.alst;

import java.util.Optional;

public class GuruDao {
    public Optional<Guru> findById(Long id) {
        Guru guru = new Guru();
        guru.setName("Андрей");
        return Optional.of(guru);
    }
}
