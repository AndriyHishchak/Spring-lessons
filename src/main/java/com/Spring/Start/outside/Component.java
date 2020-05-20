package com.Spring.Start.outside;

import org.springframework.stereotype.Service;

@Service
public class Component {



    public String learnMe(){
        return  "(def memoized-expensive-work (memoize yourwork))";
    }
}
