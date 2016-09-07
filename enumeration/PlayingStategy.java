package com.ee.enumeration;

/**
 * Created by Vishal on 07-09-2016.
 */
public enum PlayingStategy {

    T20_STYLE {
        @Override
        public String play(){
          return "Playing offensively";
        }
    },
    TEST_STYLE {
        @Override
        public String play(){
            return "Playing defensively";
        }
    },
    ONE_DAY_STYLE {
        @Override
        public String play(){
            return "Playing both offensively and defensively";
        }
    };

    abstract public String play();
}



