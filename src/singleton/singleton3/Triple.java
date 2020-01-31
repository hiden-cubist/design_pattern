package singleton.singleton3;

class Triple {
    private static Triple[] triples = {
            new Triple(),
            new Triple(),
            new Triple()
    };

    private Triple() {
    }

    static Triple getInstance(int id) {
        return triples[id];
    }
}
