package jdc.spring.sfgpetclinic.bootstrap;

import jdc.spring.sfgpetclinic.model.Owner;
import jdc.spring.sfgpetclinic.model.Vet;
import jdc.spring.sfgpetclinic.services.OwnerService;
import jdc.spring.sfgpetclinic.services.VetService;
import jdc.spring.sfgpetclinic.services.map.OwnerServiceMap;
import jdc.spring.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(1L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("What");

        ownerService.save(owner2);

        System.out.println("Owners loaded...");

        Vet vet1 = new Vet();
        vet1.setFirstName("One");
        vet1.setLastName("Two");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Sam");
        vet2.setLastName("Help");

        vetService.save(vet1);

        System.out.println("Vets loaded...");
    }
}
