package dev.srijay.immigrate;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class immigrateService {
    @Autowired
    private immigrateRepository immigrateRepository;
    public List<immigrate> allFourms(){
        return immigrateRepository.findAll();
    }

    public Optional<immigrate> singleImmigrate(ObjectId id){
        return immigrateRepository.findById(id);
    }

    public immigrate createImmigrate(String alien_reg_num, String birth_country, String birth_province, String citizenship_country, String last_arrival_date, String arrive_dep_num, String passport_doc_num, String passport_issue_date, String passport_expiry_date,
        String passport_issue_country, String curr_nonimmigrant_status, String status_exp_date, String sevis_num, String ead_num, String street_num_name, Boolean apt, Boolean ste,
        Boolean flr, String num, String city_town, String states, String zip_code, Boolean consulate, Boolean pre_flight_inspec, Boolean entry_port, String office_address, String state_foreign_country, String foreign_street_num_name,
        Boolean foreign_apt, Boolean foreign_ste, Boolean foreign_flr, String foreign_num, String foreign_city_town, String foreign_states, String foreign_province, String foreign_postal_code, String foreign_country, Boolean passport_valid_yes, Boolean passport_valid_no){
        immigrate Immigrate = immigrateRepository.insert(new immigrate());
        return Immigrate;
    }
}
