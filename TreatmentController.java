@RestController
@RequestMapping("/api/treatments")
public class TreatmentController {

    private static final List<Treatment> treatments = new ArrayList<>();

    static {
        treatments.add(new Treatment(1, "Botox", "Reduz linhas de expressão e rugas", "images/botox.jpg"));
        treatments.add(new Treatment(2, "Ácido Hialurônico", "Melhora o contorno e volume facial", "images/acido_hialuronico.jpg"));
        treatments.add(new Treatment(3, "Harmonização Facial", "Traz equilíbrio ao rosto", "images/harmonizacao_facial.jpg"));
        treatments.add(new Treatment(4, "Bioestimulador", "Estimula produção de colágeno", "images/bioestimulador.jpg"));
        treatments.add(new Treatment(5, "Peeling Químico", "Remove células mortas da pele", "images/peeling.jpg"));
        treatments.add(new Treatment(6, "Lemon Bottle", "Combate gordura localizada", "images/lemon_bottle.jpg"));
        treatments.add(new Treatment(7, "Mesoterapia", "Rejuvenesce a pele", "images/mesoterapia.jpg"));
        treatments.add(new Treatment(8, "Collagen Trifecta", "Revitaliza e hidrata", "images/collagen_trifecta.jpg"));
        treatments.add(new Treatment(9, "Remoção de AH", "Remove ácido hialurônico antigo", "images/remocao_ah.jpg"));
        treatments.add(new Treatment(10, "Análises", "Exames completos de saúde", "images/analises.jpg"));
    }

    @GetMapping
    public List<Treatment> getAllTreatments() {
        return treatments;
    }

    @GetMapping("/{id}")
    public Treatment getTreatmentById(@PathVariable int id) {
        return treatments.stream()
                .filter(treatment -> treatment.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
