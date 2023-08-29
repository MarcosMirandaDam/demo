package com.example.marina.service;

/**
 *
 * @author Marcos Miranda
 */
@Service
public class BarcoService {

    @Autowired
    private BarcoRepository barcoRepository;

    // Guardar un barco
    public Barco saveBarco(Barco barco) {
        return barcoRepository.save(barco);
    }

    // Encontrar todos los barcos
    public List<Barco> findAllBarcos() {
        return barcoRepository.findAll();
    }

    // Encontrar un barco por ID
    public Barco findBarcoById(Long id) {
        return barcoRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Barco no encontrado con ID: " + id));
    }

    // Actualizar un barco por ID
    public Barco updateBarco(Long id, Barco updatedBarco) {
        Barco existingBarco = findBarcoById(id);
// Aquí se pueden agregar validaciones adicionales y
        lógica de actualización existingBarco
        .setNombre(updatedBarco.getNombre());
        existingBarco.setEslora(updatedBarco.getEslora());
// ... (actualizar otros atributos)
        return barcoRepository.save(existingBarco);
        // Eliminar un barco por ID
public void deleteBarco(Long id) {
        Barco barco = findBarcoById(id);
        barcoRepository.delete(barco);
    }

}
