package com.example.HtmxProjcet;

import com.example.HtmxProjcet.bean.Commande;
import com.example.HtmxProjcet.service.Facade.CommandeService;
import com.example.HtmxProjcet.bean.Produit;
import com.example.HtmxProjcet.service.Facade.ProduitService;
import com.example.HtmxProjcet.bean.Client;
import com.example.HtmxProjcet.service.Facade.ClientService;
import com.example.HtmxProjcet.bean.Reclamation;
import com.example.HtmxProjcet.service.Facade.ReclamationService;
import com.example.HtmxProjcet.bean.Facture;
import com.example.HtmxProjcet.service.Facade.FactureService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootApplication
public class HtmxProjcetApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(HtmxProjcetApplication.class, args);
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        return objectMapper;
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            if (true) {
                createCommande(commandeService);
                createProduit(produitService);
                createClient(clientService);
                createReclamation(reclamationService);
                createFacture(factureService);
            }
        };
    }

    private void createCommande(CommandeService commandeService) {
        String total = "total";
        for (int i = 1; i < 100; i++) {
            Commande item = new Commande();
            item.setTotal(fakeDouble(total, i));
            commandeService.save(item);
        }
    }

    private void createProduit(ProduitService produitService) {
        String code = "code";
        String prix = "prix";
        for (int i = 1; i < 100; i++) {
            Produit item = new Produit();
            item.setCode(fakeString(code, i));
            item.setPrix(fakeDouble(prix, i));
            produitService.save(item);
        }
    }

    private void createClient(ClientService clientService) {
        String nom = "nom";
        String prenom = "prenom";
        for (int i = 1; i < 100; i++) {
            Client item = new Client();
            item.setNom(fakeString(nom, i));
            item.setPrenom(fakeString(prenom, i));
            clientService.save(item);
        }
    }

    private void createReclamation(ReclamationService reclamationService) {
        String contenu = "contenu";
        for (int i = 1; i < 100; i++) {
            Reclamation item = new Reclamation();
            item.setContenu(fakeString(contenu, i));
            reclamationService.save(item);
        }
    }

    private void createFacture(FactureService factureService) {
        String total = "total";
        String dateFcature = "dateFcature";
        for (int i = 1; i < 100; i++) {
            Facture item = new Facture();
            item.setTotal(fakeBigDecimal(total, i));
            item.setDateFcature(fakeLocalDateTime(dateFcature, i));
            factureService.save(item);
        }
    }

    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }

    private static Long fakeLong(String attributeName, int i) {
        return 10L * i;
    }

    private static Integer fakeInteger(String attributeName, int i) {
        return 10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return BigDecimal.valueOf(i * 1L * 10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0;
    }

    @Autowired
    private CommandeService commandeService;
    @Autowired
    private ProduitService produitService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private ReclamationService reclamationService;
    @Autowired
    private FactureService factureService;
}
