package senna.app.Asteroides.repository;

public class AsteroidedRepository {

    public static final String ASTEROIDES_JSON = """
    {
      "asteroides": [
        {
          "id": "617",
          "name": "Pátroclo",
          "a": 5.217,
          "e": 0.138,
          "i": 22.05,
          "longPeri": 308.291,
          "longNode": 33.9,
          "n": 0.191,
          "t": null,
          "description": "617 Pátroclo is a large Jupiter trojan asteroid, orbiting in Jupiter's L5 Lagrangian point. It is part of a binary system with its companion, Menoetius. Pátroclo is unique due to its large size and binary nature.",
          "pHAs": false
        },
        {
          "id": "243",
          "name": "Ida",
          "a": 2.862,
          "e": 0.205,
          "i": 4.07,
          "longPeri": 164.05,
          "longNode": 134.83,
          "n": 0.174,
          "t": null,
          "description": "243 Ida is a large asteroid located in the asteroid belt. It is notable for being the first asteroid discovered to have a moon, Dactyl. Ida has a relatively low albedo and a surface marked by impact craters.",
          "pHAs": false
        },
        {
          "id": "16",
          "name": "Psique",
          "a": 2.414,
          "e": 0.189,
          "i": 3.44,
          "longPeri": 135.87,
          "longNode": 208.58,
          "n": 0.188,
          "t": null,
          "description": "16 Psique is a large metallic asteroid located in the asteroid belt. It is believed to be composed mainly of iron and nickel, similar to Earth's core. Psique is unique because it is thought to be a remnant of a protoplanet, and it is one of the largest asteroids in the belt.",
          "pHAs": false
        },
        {
          "id": "9969",
          "name": "Braille",
          "a": 2.248,
          "e": 0.071,
          "i": 6.12,
          "longPeri": 210.50,
          "longNode": 75.78,
          "n": 0.273,
          "t": null,
          "description": "9969 Braille is a binary asteroid located in the main asteroid belt. It is named after Louis Braille, the inventor of Braille, a system for reading and writing used by the visually impaired. The asteroid has a small companion moon, which makes it a unique object for study.",
          "pHAs": false
        },
        {
          "id": "152830",
          "name": "Dinkinesh",
          "a": 2.832,
          "e": 0.071,
          "i": 6.36,
          "longPeri": 127.89,
          "longNode": 151.06,
          "n": 0.220,
          "t": null,
          "description": "152830 Dinkinesh is a relatively small asteroid located in the main belt, named after the Ethiopian word for 'human'. It is notable for its irregular shape and surface features.",
          "pHAs": false
        },
        {
          "id": "951",
          "name": "Gaspra",
          "a": 1.930,
          "e": 0.146,
          "i": 7.13,
          "longPeri": 313.51,
          "longNode": 49.63,
          "n": 0.372,
          "t": null,
          "description": "951 Gaspra is a small asteroid located in the asteroid belt, known for its irregular shape and as the first asteroid to be visited by a spacecraft, during the Galileo mission.",
          "pHAs": false
        },
        {
          "id": "21900",
          "name": "Orus",
          "a": 3.142,
          "e": 0.200,
          "i": 10.35,
          "longPeri": 29.36,
          "longNode": 309.12,
          "n": 0.157,
          "t": null,
          "description": "21900 Orus is a relatively small asteroid in the main belt. It has a low albedo and a dark surface, typical of carbonaceous asteroids.",
          "pHAs": false
        },
        {
          "id": "11351",
          "name": "Leucus",
          "a": 3.153,
          "e": 0.095,
          "i": 8.37,
          "longPeri": 198.52,
          "longNode": 99.79,
          "n": 0.157,
          "t": null,
          "description": "11351 Leucus is a medium-sized asteroid located in the asteroid belt. It is named after a character from Greek mythology and has been studied for its surface composition.",
          "pHAs": false
        },
        {
          "id": "253",
          "name": "Mathilde",
          "a": 2.77,
          "e": 0.23,
          "i": 6.8,
          "longPeri": 251.7,
          "longNode": 34.2,
          "n": 0.149,
          "t": null,
          "description": "253 Mathilde is a large asteroid located in the asteroid belt. It is notable for its low density and irregular shape, and it was visited by the NEAR spacecraft.",
          "pHAs": false
        },
        {
          "id": "3548",
          "name": "Eurybates",
          "a": 3.286,
          "e": 0.084,
          "i": 10.88,
          "longPeri": 95.12,
          "longNode": 311.42,
          "n": 0.134,
          "t": null,
          "description": "3548 Eurybates is a large asteroid located in the main belt, known for its binary nature, having a companion moon.",
          "pHAs": false
        },
        {
          "id": "15094",
          "name": "Polymele",
          "a": 3.483,
          "e": 0.097,
          "i": 7.29,
          "longPeri": 176.89,
          "longNode": 266.61,
          "n": 0.107,
          "t": null,
          "description": "15094 Polymele is a binary asteroid located in the outer asteroid belt, known for its complex orbit and physical characteristics.",
          "pHAs": false
        },
        {
          "id": "162173",
          "name": "Ryugu",
          "a": 0.965,
          "e": 0.196,
          "i": 5.73,
          "longPeri": 119.77,
          "longNode": 254.43,
          "n": 0.463,
          "t": null,
          "description": "162173 Ryugu is a near-Earth asteroid that was visited by the Hayabusa2 mission. It is a C-type asteroid with a rubble-pile structure.",
          "pHAs": false
        },
        {
          "id": "52246",
          "name": "Donaldjohanson",
          "a": 2.328,
          "e": 0.136,
          "i": 7.73,
          "longPeri": 104.48,
          "longNode": 106.20,
          "n": 0.247,
          "t": null,
          "description": "52246 Donaldjohanson is an asteroid named after the anthropologist who discovered the famous 'Lucy' fossil.",
          "pHAs": false
        },
        {
          "id": "25143",
          "name": "Itokawa",
          "a": 0.943,
          "e": 0.281,
          "i": 1.98,
          "longPeri": 73.59,
          "longNode": 269.78,
          "n": 0.579,
          "t": null,
          "description": "25143 Itokawa is a small near-Earth asteroid that was visited by the Hayabusa mission. It is known for its peanut-like shape.",
          "pHAs": false
        },
        {
          "id": "4",
          "name": "Vesta",
          "a": 2.361,
          "e": 0.090,
          "i": 7.14,
          "longPeri": 135.92,
          "longNode": 34.44,
          "n": 0.224,
          "t": null,
          "description": "4 Vesta is one of the largest asteroids in the asteroid belt and has been studied extensively due to its geological features and composition.",
          "pHAs": false
        },
        {
          "id": "99942",
          "name": "Apófis",
          "a": 0.922,
          "e": 0.191,
          "i": 3.34,
          "longPeri": 117.93,
          "longNode": 247.67,
          "n": 0.604,
          "t": null,
          "description": "99942 Apófis is a near-Earth asteroid known for its potential risk of impacting Earth. It has a relatively small size but has garnered significant attention.",
          "pHAs": true
        },
        {
          "id": "433",
          "name": "Eros",
          "a": 1.458,
          "e": 0.223,
          "i": 10.83,
          "longPeri": 200.19,
          "longNode": 42.12,
          "n": 0.395,
          "t": null,
          "description": "433 Eros is a near-Earth asteroid that was the first asteroid to be orbited by a spacecraft, NEAR Shoemaker. It is one of the largest asteroids in its category.",
          "pHAs": true
        },
        {
          "id": "5535",
          "name": "Annefrank",
          "a": 2.067,
          "e": 0.202,
          "i": 9.38,
          "longPeri": 214.15,
          "longNode": 144.87,
          "n": 0.267,
          "t": null,
          "description": "5535 Annefrank is a small asteroid located in the main belt, named in honor of Anne Frank. It is known for its irregular shape.",
          "pHAs": false
        },
        {
          "id": "101955",
          "name": "Bennu",
          "a": 0.463,
          "e": 0.203,
          "i": 6.94,
          "longPeri": 81.11,
          "longNode": 303.80,
          "n": 0.771,
          "t": null,
          "description": "101955 Bennu is a near-Earth asteroid that was visited by the OSIRIS-REx mission. It is classified as a potentially hazardous asteroid due to its orbit.",
          "pHAs": true
        },
        {
          "id": "21",
          "name": "Lutécia",
          "a": 2.734,
          "e": 0.168,
          "i": 6.66,
          "longPeri": 61.19,
          "longNode": 108.83,
          "n": 0.177,
          "t": null,
          "description": "21 Lutécia is an asteroid located in the asteroid belt, named after a Celtic tribe in the ancient region of Lutetia.",
          "pHAs": false
        }
      ]
    }
    """;
}