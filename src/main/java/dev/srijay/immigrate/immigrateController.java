package dev.srijay.immigrate;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins={"http://localhost:3000","http://localhost:3000/new"}, allowedHeaders = {"Authorization", "Content-Type"}, allowCredentials = "true")
@RequestMapping("/api/v1/immigrates")
public class immigrateController {
    @Autowired
    private immigrateService immigrateService;

    @GetMapping
    public ResponseEntity<List<immigrate>> getAllFourms() {
        return new ResponseEntity<List<immigrate>>(immigrateService.allFourms(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<immigrate>> getSingleImmigrate(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<immigrate>>(immigrateService.singleImmigrate(id), HttpStatus.OK);
    }



        // ... Other methods and dependencies ...

    @PostMapping("/api/v1/immigrates")
    public ResponseEntity<String> createImmigrate(@RequestBody immigrate requestImmigrate) {

        immigrate newImmigrate = new immigrate();
        newImmigrate.setAlien_reg_num(requestImmigrate.getAlien_reg_num());
        newImmigrate.setBirth_country(requestImmigrate.getBirth_country());
        // ... Set other properties ...

        immigrate savedImmigrate = newImmigrate;

        return null;
        //return new ResponseEntity<immigrate>(immigrateService.createImmigrate(requestImmigrate.getAlien_reg_num(), requestImmigrate.getBirth_country(), requestImmigrate.getBirth_province() ,requestImmigrate.getCitizenship_country() ,requestImmigrate.getLast_arrival_date() ,requestImmigrate.getArrive_dep_num() ,requestImmigrate.getPassport_doc_num() ,requestImmigrate.getPassport_issue_date() ,requestImmigrate.getPassport_expiry_date() ,requestImmigrate.getPassport_issue_country() ,requestImmigrate.getCurr_nonimmigrant_status() ,requestImmigrate.getStatus_exp_date() ,requestImmigrate.getSevis_num() ,requestImmigrate.getEad_num() ,requestImmigrate.getStreet_num_name(),
        //        requestImmigrate.getApt() ,requestImmigrate.getSte() ,requestImmigrate.getFlr() ,requestImmigrate.getNum() ,requestImmigrate.getCity_town() ,requestImmigrate.getStates() ,requestImmigrate.getZip_code() ,requestImmigrate.getConsulate() ,requestImmigrate.getPre_flight_inspec() ,requestImmigrate.getEntry_port() ,requestImmigrate.getOffice_address() ,requestImmigrate.getState_foreign_country() ,requestImmigrate.getForeign_street_num_name() ,requestImmigrate.getForeign_apt() ,requestImmigrate.getForeign_ste() ,requestImmigrate.getForeign_flr() ,requestImmigrate.getForeign_num() ,requestImmigrate.getForeign_city_town() ,requestImmigrate.getForeign_states() ,requestImmigrate.getForeign_province() ,requestImmigrate.getForeign_postal_code() ,requestImmigrate.getForeign_country() ,requestImmigrate.getPassport_valid_yes() ,requestImmigrate.getPassport_valid_no()) ,HttpStatus.OK);
    }


}
