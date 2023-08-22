/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import servicos.PacienteServicos;

/**
 *
 * @author thayn
 */
public class TesteTableBuscaPacienteJUnit {

    private PacienteServicos pacServ;
    ArrayList<Paciente> p = new ArrayList<>();

    public TesteTableBuscaPacienteJUnit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws SQLException {
        pacServ = new PacienteServicos();
        String query1 = "where ID_PACIENTE = 2";
        p = pacServ.buscarPacienteFiltro(query1);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testeBusca() throws SQLException {
        assertTrue(pacServ.buscarPaciente().size()>=2);
    }

}
