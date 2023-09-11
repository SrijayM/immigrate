package dev.srijay.immigrate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="fourms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class immigrate {
    @Id
    private ObjectId id;

    private String alien_reg_num;
    private String birth_country;
    private String birth_province;
    private String citizenship_country;

    private String last_arrival_date;
    private String arrive_dep_num;
    private String passport_doc_num;
    private String passport_issue_date;
    private String passport_expiry_date;
    private String passport_issue_country;
    private String curr_nonimmigrant_status;
    private String status_exp_date;
    private String sevis_num;
    private String ead_num;

    private String street_num_name;
    private Boolean apt;
    private Boolean ste;
    private Boolean flr;
    private String num;
    private String city_town;
    private String states;
    private String zip_code;

    private Boolean consulate;
    private Boolean pre_flight_inspec;
    private Boolean entry_port;
    private String office_address;
    private String state_foreign_country;

    private String foreign_street_num_name;
    private Boolean foreign_apt;
    private Boolean foreign_ste;
    private Boolean foreign_flr;
    private String foreign_num;
    private String foreign_city_town;
    private String foreign_states;
    private String foreign_province;
    private String foreign_postal_code;
    private String foreign_country;
    private Boolean passport_valid_yes;
    private Boolean passport_valid_no;
}
