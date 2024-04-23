package by.alst;

import java.util.Optional;

public class GuruService {

    private final GuruDao guruDao = new GuruDao();

    public Optional<GuruDto> getUser(Long id) {
        return guruDao.findById(id).map(it -> new GuruDto(it.getName()));
    }
}
