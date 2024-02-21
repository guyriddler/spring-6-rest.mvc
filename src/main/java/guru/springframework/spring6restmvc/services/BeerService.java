package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Beer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt, Spring Framework Guru.
 */

public interface BeerService {

    Beer getBeerById(UUID id);
}
