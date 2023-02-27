package tn.esprit.kaddemproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.kaddemproject.entities.Contrat;
import tn.esprit.kaddemproject.entities.Specialite;
import tn.esprit.kaddemproject.repositories.ContratRepository;
import tn.esprit.kaddemproject.services.IContratServiceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class KaddemProjectApplicationTests {

    @Mock
    ContratRepository contratRepo;
    @InjectMocks
    IContratServiceImp contratService;


    @Test
    public void retrieveAndUpdateStatusContratTest(){
        Contrat c = new Contrat( 2000);
        Contrat c2 = new Contrat( 2000);
        Contrat c3 = new Contrat( 2000);
        Contrat c4 = new Contrat( 2000);

        List<Contrat> list = new ArrayList<Contrat>(){
            {
                add(c);
                add(c2);
                add(c3);
                add(c4);
            }
        };
        Mockito.when(contratService.retrieveAll()).thenReturn(list);

    }
}
