/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import dao.PacienteDAO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author thayn
 */

public class TesteCadPacienteJUnit {

private PacienteDAO pacDAO;


    public TesteCadPacienteJUnit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws ParseException, SQLException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        pacDAO = new PacienteDAO();
        Paciente pac1 = new Paciente();
        pac1.setNome("Julia");
        pac1.setEndereco("Rua Um");
        pac1.setDataNascimento(sdf.parse("21/08/2000"));
        pac1.setTelefone("(51)98887811");
        pac1.setCpf("111.111.111-11");
        pac1.setRg("11111111111");
        pac1.setConvenio(2);
        pacDAO.cadastrarPaciente(pac1);
        
        Paciente pac2 = new Paciente();
        pac2.setNome("Marcia");
        pac2.setEndereco("Rua Dois");
        pac2.setDataNascimento(sdf.parse("21/08/1990"));
        pac2.setTelefone("(51)98887811");
        pac2.setCpf("121.131.141-11");
        pac2.setRg("12121212111");
        pac2.setConvenio(2);
        pacDAO.cadastrarPaciente(pac2);
        
        
        
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testePossuiMaisdeUmCadastro() throws SQLException {
        assertTrue(pacDAO.buscarPaciente().size()>=2);
    }   

         
    
    
}
