package com.tax.fees.webservice.resource;

import com.tax.fees.webservice.filters.AllowedAccess;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountFeesResource {

    @RequestMapping(value = "/{tin}", method = RequestMethod.GET)
    @AllowedAccess(property = "$account-fess.webservice-{allowed.access}")
    public String getFeeForTIN(@PathVariable String tin){
        return tin;
    }

    @RequestMapping(value = "/updateFee/{tin}", method = RequestMethod.POST)
    @AllowedAccess(property = "$account-fess.webservice-{allowed.access}")
    public void updateFeeForTIN(@PathVariable String tin, @RequestBody int fee){
        System.out.println("Updated fee for " + tin + " is " + fee);
    }
}
