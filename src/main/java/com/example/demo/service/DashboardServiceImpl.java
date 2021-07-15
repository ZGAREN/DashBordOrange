package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Locale;
import java.util.stream.Stream;

@Transactional
@Service
public class DashboardServiceImpl implements IDashboradServie {
    @Autowired
    private GroupeOrangeRepository groupeOrangeRepository;
    @Autowired
    private CountrieRepository countrieRepository;
    @Autowired
    private ItInventoryRepository itInventoryRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ToolsRepository toolsRepository;
    @Autowired
    private EcosystemBiEnvirennementRepository ecosystemBiEnvirennementRepository;
    @Autowired
    private EcosystemBigDataPlatformRepository ecosystemBigDataPlatformRepository;
    @Autowired
    private TechnicalStreamRepository technicalStreamRepository;


    @Override
    public void initGroupes() {
        Stream.of("OMEA","Europe").forEach(nameGroupe->{
            GroupeOrange groupeOrg = new GroupeOrange();
            groupeOrg.setNameGroup(nameGroupe);
            groupeOrangeRepository.save(groupeOrg);
        });
    }

    @Override
    public void initCountry() {
        groupeOrangeRepository.findAll().forEach(gp->{
            if(gp.getIdGroup() == 1) {

                Stream.of("Maroc", "Tunisie", "Mali", "Burkina Faso", "Nijer", "Egypte", "Cameroun", "Sénegal", "Jordan", "Iraq",
                        "Madagascar", "Botswana", "République centrafricaine", "République démocratique du Congo")
                        .forEach(nameCountry -> {
                            Countrie countrie = new Countrie();
                            countrie.setName_Countrie(nameCountry);
                            countrie.setFlag_Countrie(nameCountry.replace(" ", "") + ".png");
                            countrie.setLabelCountry(nameCountry.substring(0,3).toUpperCase(Locale.ROOT));
                            countrie.setLabelOrangeCountry("O_"+countrie.getLabelCountry());
                            countrie.setGroupe(gp);
                            countrieRepository.save(countrie);
                        });



            }else Stream.of("France", "Belgique", "Espagne", "Luxembourg","Poland", "Slovakia", "Romania", "Moldova")
                    .forEach(nameCountry -> {
                        Countrie countrie = new Countrie();
                        countrie.setName_Countrie(nameCountry);
                        countrie.setFlag_Countrie(nameCountry.replace(" ", "") + ".png");
                        countrie.setLabelCountry(nameCountry.substring(0,3).toUpperCase(Locale.ROOT));
                        countrie.setLabelOrangeCountry("O_"+countrie.getLabelCountry());
                        countrie.setGroupe(gp);
                        countrieRepository.save(countrie);
                    });
        });
    }

    @Override
    public void initItinventory() {
        countrieRepository.findAll().forEach(cat->{

            Stream.of("Data collection", "Data processing","Devops","AI & ML",
                    "Data sources","Data visualisation ","Data analytics","BI – Big Data","Convergence status")
                    .forEach(nameCategorie->{
                        ITinventory categorie = new ITinventory();
                        categorie.setNameCategorie(nameCategorie);
                        categorie.setCountries(cat);
                        itInventoryRepository.save(categorie);
                    });
        });
    }



    @Override
    public void initUsers() {
        countrieRepository.findAll().forEach(users->{
            Stream.of("Hassen","Devops","Ali & Ahmed", "Stephane","Sarah","Majd","Tina","Ramzy")
                    .forEach(nameUser->{
                        User user = new User();
                        user.setNameUser(nameUser);
                        user.setCuid_User(3+(int)(Math.random()*6));
                        user.setCountries(users);
                        userRepository.save(user);
                    });
        });
    }

    @Override
    public void initTools() {
        itInventoryRepository.findAll().forEach(tools->{
            Stream.of("Java",".Net","C++","Git", "Hue","Zepplin","MetaData","Spring","ANgular",
                    "Java",".Net","C++","Git", "Hue","Zepplin","MetaData","Spring","ANgular")
                    .forEach(nameTool->{
                        Tool tool1 = new Tool();
                        tool1.setNameTools(nameTool);
                        toolsRepository.save(tool1);
                    });
        });

    }


    @Override
    public void initEcosysBiEnvirenment() {

    }

    @Override
    public void initEcosysBigDataPlatform() {

    }

    @Override
    public void initTechnicalStram() {

    }



    @Override
    public void initStaus() {

    }
}
