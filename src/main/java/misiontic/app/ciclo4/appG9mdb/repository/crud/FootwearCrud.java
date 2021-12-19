package misiontic.app.ciclo4.appG9mdb.repository.crud;

import misiontic.app.ciclo4.appG9mdb.model.Footwear;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface FootwearCrud extends MongoRepository<Footwear,String> {

    @Query("{'price': {$lte:?0}}")
    List<Footwear> findByPrice(double price);

    @Query("{'description': {$regex:?0,$options:'i'}}")
    List<Footwear> findByDescription(String description);


}
