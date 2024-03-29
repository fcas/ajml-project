package models.funcionario;

import org.jmlspecs.ajmlrac.runtime.*;

public privileged aspect AspectJMLRac_AbstractFuncionario {










  /** Generated by JML to access the model field inome. */
  before (models.funcionario.IFuncionario object$rac): get(java.lang.String models.funcionario.IFuncionario.inome) && target (object$rac)
  && if (object$rac instanceof models.funcionario.AbstractFuncionario){
    object$rac.inome = ((java.lang.String) (((models.funcionario.AbstractFuncionario)object$rac).nome));
  }

  /** Generated by JML to access the model field irg. */
  before (models.funcionario.IFuncionario object$rac): get(java.lang.String models.funcionario.IFuncionario.irg) && target (object$rac)
  && if (object$rac instanceof models.funcionario.AbstractFuncionario){
    object$rac.irg = ((java.lang.String) (((models.funcionario.AbstractFuncionario)object$rac).rg));
  }

  /** Generated by JML to access the model field icpf. */
  before (models.funcionario.IFuncionario object$rac): get(java.lang.String models.funcionario.IFuncionario.icpf) && target (object$rac)
  && if (object$rac instanceof models.funcionario.AbstractFuncionario){
    object$rac.icpf = ((java.lang.String) (((models.funcionario.AbstractFuncionario)object$rac).cpf));
  }

  /** Generated by JML to access the model field icargo. */
  before (models.funcionario.IFuncionario object$rac): get(java.lang.String models.funcionario.IFuncionario.icargo) && target (object$rac)
  && if (object$rac instanceof models.funcionario.AbstractFuncionario){
    object$rac.icargo = ((java.lang.String) (((models.funcionario.AbstractFuncionario)object$rac).dataNascimento));
  }

  /** Generated by JML to access the model field isalario. */
  before (models.funcionario.IFuncionario object$rac): get(double models.funcionario.IFuncionario.isalario) && target (object$rac)
  && if (object$rac instanceof models.funcionario.AbstractFuncionario){
    object$rac.isalario = ((models.funcionario.AbstractFuncionario)object$rac).salario;
  }

  /** Generated by JML to check the exceptional postcondition of
   * method getNome. */
  after (final models.funcionario.AbstractFuncionario object$rac) throwing (Throwable rac$e) :
     execution(java.lang.String models.funcionario.AbstractFuncionario.getNome()) && this(object$rac) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "models.funcionario.AbstractFuncionario.getNome()");
           boolean rac$b = true;
           String rac$ErrorMsg = "";
           String xPostErrorMsg =  "by method models.funcionario.AbstractFuncionario.getNome regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 30 (models.funcionario.AbstractFuncionario.java:30)";
           if(rac$ErrorMsg.indexOf("and") >= 0){
             rac$ErrorMsg += " are ";
           }
           else{
             rac$ErrorMsg += " is ";
           }
           JMLChecker.checkExceptionalPostcondition(rac$b, xPostErrorMsg+"\n\t"+rac$ErrorMsg+rac$e, -1, false, "models.funcionario.AbstractFuncionario.getNome()");
  	 }

  /** Generated by JML to check the exceptional postcondition of
   * method getRg. */
  after (final models.funcionario.AbstractFuncionario object$rac) throwing (Throwable rac$e) :
     execution(java.lang.String models.funcionario.AbstractFuncionario.getRg()) && this(object$rac) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "models.funcionario.AbstractFuncionario.getRg()");
           boolean rac$b = true;
           String rac$ErrorMsg = "";
           String xPostErrorMsg =  "by method models.funcionario.AbstractFuncionario.getRg regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 38 (models.funcionario.AbstractFuncionario.java:38)";
           if(rac$ErrorMsg.indexOf("and") >= 0){
             rac$ErrorMsg += " are ";
           }
           else{
             rac$ErrorMsg += " is ";
           }
           JMLChecker.checkExceptionalPostcondition(rac$b, xPostErrorMsg+"\n\t"+rac$ErrorMsg+rac$e, -1, false, "models.funcionario.AbstractFuncionario.getRg()");
  	 }

  /** Generated by JML to check the exceptional postcondition of
   * method getCpf. */
  after (final models.funcionario.AbstractFuncionario object$rac) throwing (Throwable rac$e) :
     execution(java.lang.String models.funcionario.AbstractFuncionario.getCpf()) && this(object$rac) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "models.funcionario.AbstractFuncionario.getCpf()");
           boolean rac$b = true;
           String rac$ErrorMsg = "";
           String xPostErrorMsg =  "by method models.funcionario.AbstractFuncionario.getCpf regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 46 (models.funcionario.AbstractFuncionario.java:46)";
           if(rac$ErrorMsg.indexOf("and") >= 0){
             rac$ErrorMsg += " are ";
           }
           else{
             rac$ErrorMsg += " is ";
           }
           JMLChecker.checkExceptionalPostcondition(rac$b, xPostErrorMsg+"\n\t"+rac$ErrorMsg+rac$e, -1, false, "models.funcionario.AbstractFuncionario.getCpf()");
  	 }

  /** Generated by JML to check the exceptional postcondition of
   * method getDataNascimento. */
  after (final models.funcionario.AbstractFuncionario object$rac) throwing (Throwable rac$e) :
     execution(java.lang.String models.funcionario.AbstractFuncionario.getDataNascimento()) && this(object$rac) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "models.funcionario.AbstractFuncionario.getDataNascimento()");
           boolean rac$b = true;
           String rac$ErrorMsg = "";
           String xPostErrorMsg =  "by method models.funcionario.AbstractFuncionario.getDataNascimento regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 54 (models.funcionario.AbstractFuncionario.java:54)";
           if(rac$ErrorMsg.indexOf("and") >= 0){
             rac$ErrorMsg += " are ";
           }
           else{
             rac$ErrorMsg += " is ";
           }
           JMLChecker.checkExceptionalPostcondition(rac$b, xPostErrorMsg+"\n\t"+rac$ErrorMsg+rac$e, -1, false, "models.funcionario.AbstractFuncionario.getDataNascimento()");
  	 }

  /** Generated by JML to check the exceptional postcondition of
   * method getCargo. */
  after (final models.funcionario.AbstractFuncionario object$rac) throwing (Throwable rac$e) :
     execution(java.lang.String models.funcionario.AbstractFuncionario.getCargo()) && this(object$rac) {
           JMLChecker.rethrowJMLAssertionError(rac$e, "models.funcionario.AbstractFuncionario.getCargo()");
           boolean rac$b = true;
           String rac$ErrorMsg = "";
           String xPostErrorMsg =  "by method models.funcionario.AbstractFuncionario.getCargo regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 62 (models.funcionario.AbstractFuncionario.java:62)";
           if(rac$ErrorMsg.indexOf("and") >= 0){
             rac$ErrorMsg += " are ";
           }
           else{
             rac$ErrorMsg += " is ";
           }
           JMLChecker.checkExceptionalPostcondition(rac$b, xPostErrorMsg+"\n\t"+rac$ErrorMsg+rac$e, -1, false, "models.funcionario.AbstractFuncionario.getCargo()");
  	 }

  /** Generated by JML to check non-static invariants of 
   * class AbstractFuncionario. */
  before (final models.funcionario.AbstractFuncionario object$rac) :
     execution(!static * models.funcionario.AbstractFuncionario+.*(..)) && 
     !@annotation(JMLHelper) && 
     this(object$rac) {
       boolean rac$b = (((((object$rac.nome != null) && (object$rac.rg != null)) && (object$rac.cpf != null)) && (object$rac.dataNascimento != null)) && (object$rac.cargo != null));
       String invErrorMsg = "@pre <File \"AbstractFuncionario.java\"> regarding code at \nFile \"AbstractFuncionario.java\"\nnon_null for field 'nome' <File \"models.funcionario.AbstractFuncionario.java\", line 5, character 49 (models.funcionario.AbstractFuncionario.java:5)>\nnon_null for field 'rg' <File \"models.funcionario.AbstractFuncionario.java\", line 9, character 47 (models.funcionario.AbstractFuncionario.java:9)>\nnon_null for field 'cpf' <File \"models.funcionario.AbstractFuncionario.java\", line 13, character 48 (models.funcionario.AbstractFuncionario.java:13)>\nnon_null for field 'dataNascimento' <File \"models.funcionario.AbstractFuncionario.java\", line 17, character 59 (models.funcionario.AbstractFuncionario.java:17)>\nnon_null for field 'cargo' <File \"models.funcionario.AbstractFuncionario.java\", line 21, character 50 (models.funcionario.AbstractFuncionario.java:21)>\n";
       String evalErrorMsg = "Invalid expression in \"@pre <File \"AbstractFuncionario.java\"> regarding code at \nFile \"AbstractFuncionario.java\"\nnon_null for field 'nome' <File \"models.funcionario.AbstractFuncionario.java\", line 5, character 49 (models.funcionario.AbstractFuncionario.java:5)>\nnon_null for field 'rg' <File \"models.funcionario.AbstractFuncionario.java\", line 9, character 47 (models.funcionario.AbstractFuncionario.java:9)>\nnon_null for field 'cpf' <File \"models.funcionario.AbstractFuncionario.java\", line 13, character 48 (models.funcionario.AbstractFuncionario.java:13)>\nnon_null for field 'dataNascimento' <File \"models.funcionario.AbstractFuncionario.java\", line 17, character 59 (models.funcionario.AbstractFuncionario.java:17)>\nnon_null for field 'cargo' <File \"models.funcionario.AbstractFuncionario.java\", line 21, character 50 (models.funcionario.AbstractFuncionario.java:21)>\n\nCaused by: ";
       JMLChecker.checkInvariant(rac$b, invErrorMsg, evalErrorMsg, -1, false);

     }

  /** Generated by JML to check the precondition of
   * method setNome. */
  before (final models.funcionario.AbstractFuncionario object$rac, final java.lang.String nome) :
     execution(void models.funcionario.AbstractFuncionario.setNome(java.lang.String)) && 
     this(object$rac) && args(nome) {
       boolean rac$b = (nome != null);
       boolean canThrow = false;
       String preErrorMsg = "by method models.funcionario.AbstractFuncionario.setNome regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 34 (models.funcionario.AbstractFuncionario.java:34)"+", when \n"+"\t\'nome\' is "+nome;
       String evalErrorMsg = "Invalid expression in \"models.funcionario.AbstractFuncionario.java\"\nCaused by: ";
       JMLChecker.checkPrecondition(rac$b, canThrow, preErrorMsg, evalErrorMsg, -1, false, "models.funcionario.AbstractFuncionario.setNome(java.lang.String nome)");

     }

  /** Generated by JML to check the precondition of
   * method setRg. */
  before (final models.funcionario.AbstractFuncionario object$rac, final java.lang.String rg) :
     execution(void models.funcionario.AbstractFuncionario.setRg(java.lang.String)) && 
     this(object$rac) && args(rg) {
       boolean rac$b = (rg != null);
       boolean canThrow = false;
       String preErrorMsg = "by method models.funcionario.AbstractFuncionario.setRg regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 42 (models.funcionario.AbstractFuncionario.java:42)"+", when \n"+"\t\'rg\' is "+rg;
       String evalErrorMsg = "Invalid expression in \"models.funcionario.AbstractFuncionario.java\"\nCaused by: ";
       JMLChecker.checkPrecondition(rac$b, canThrow, preErrorMsg, evalErrorMsg, -1, false, "models.funcionario.AbstractFuncionario.setRg(java.lang.String rg)");

     }

  /** Generated by JML to check the precondition of
   * method setCpf. */
  before (final models.funcionario.AbstractFuncionario object$rac, final java.lang.String cpf) :
     execution(void models.funcionario.AbstractFuncionario.setCpf(java.lang.String)) && 
     this(object$rac) && args(cpf) {
       boolean rac$b = (cpf != null);
       boolean canThrow = false;
       String preErrorMsg = "by method models.funcionario.AbstractFuncionario.setCpf regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 50 (models.funcionario.AbstractFuncionario.java:50)"+", when \n"+"\t\'cpf\' is "+cpf;
       String evalErrorMsg = "Invalid expression in \"models.funcionario.AbstractFuncionario.java\"\nCaused by: ";
       JMLChecker.checkPrecondition(rac$b, canThrow, preErrorMsg, evalErrorMsg, -1, false, "models.funcionario.AbstractFuncionario.setCpf(java.lang.String cpf)");

     }

  /** Generated by JML to check the precondition of
   * method setDataNascimento. */
  before (final models.funcionario.AbstractFuncionario object$rac, final java.lang.String dataNascimento) :
     execution(void models.funcionario.AbstractFuncionario.setDataNascimento(java.lang.String)) && 
     this(object$rac) && args(dataNascimento) {
       boolean rac$b = (dataNascimento != null);
       boolean canThrow = false;
       String preErrorMsg = "by method models.funcionario.AbstractFuncionario.setDataNascimento regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 58 (models.funcionario.AbstractFuncionario.java:58)"+", when \n"+"\t\'dataNascimento\' is "+dataNascimento;
       String evalErrorMsg = "Invalid expression in \"models.funcionario.AbstractFuncionario.java\"\nCaused by: ";
       JMLChecker.checkPrecondition(rac$b, canThrow, preErrorMsg, evalErrorMsg, -1, false, "models.funcionario.AbstractFuncionario.setDataNascimento(java.lang.String dataNascimento)");

     }

  /** Generated by JML to check the precondition of
   * method setCargo. */
  before (final models.funcionario.AbstractFuncionario object$rac, final java.lang.String cargo) :
     execution(void models.funcionario.AbstractFuncionario.setCargo(java.lang.String)) && 
     this(object$rac) && args(cargo) {
       boolean rac$b = (cargo != null);
       boolean canThrow = false;
       String preErrorMsg = "by method models.funcionario.AbstractFuncionario.setCargo regarding code at \nFile \"models.funcionario.AbstractFuncionario.java\", line 66 (models.funcionario.AbstractFuncionario.java:66)"+", when \n"+"\t\'cargo\' is "+cargo;
       String evalErrorMsg = "Invalid expression in \"models.funcionario.AbstractFuncionario.java\"\nCaused by: ";
       JMLChecker.checkPrecondition(rac$b, canThrow, preErrorMsg, evalErrorMsg, -1, false, "models.funcionario.AbstractFuncionario.setCargo(java.lang.String cargo)");

     }


  /** Generated by JML to check non-static invariants of 
   * class AbstractFuncionario. */
  after (final models.funcionario.AbstractFuncionario object$rac) :
     (execution(!static * models.funcionario.AbstractFuncionario+.*(..)) || 
       execution(models.funcionario.AbstractFuncionario+.new(..))) && 
     !execution(void models.funcionario.AbstractFuncionario.finalize() throws Throwable) && 
     !@annotation(JMLHelper) && 
     this(object$rac) {
       if (!(JMLChecker.hasAnyJMLError)) {
         boolean rac$b = (((((object$rac.nome != null) && (object$rac.rg != null)) && (object$rac.cpf != null)) && (object$rac.dataNascimento != null)) && (object$rac.cargo != null));
         String invErrorMsg = "@post <File \"AbstractFuncionario.java\"> regarding code at \nFile \"AbstractFuncionario.java\"\nnon_null for field 'nome' <File \"models.funcionario.AbstractFuncionario.java\", line 5, character 49 (models.funcionario.AbstractFuncionario.java:5)>\nnon_null for field 'rg' <File \"models.funcionario.AbstractFuncionario.java\", line 9, character 47 (models.funcionario.AbstractFuncionario.java:9)>\nnon_null for field 'cpf' <File \"models.funcionario.AbstractFuncionario.java\", line 13, character 48 (models.funcionario.AbstractFuncionario.java:13)>\nnon_null for field 'dataNascimento' <File \"models.funcionario.AbstractFuncionario.java\", line 17, character 59 (models.funcionario.AbstractFuncionario.java:17)>\nnon_null for field 'cargo' <File \"models.funcionario.AbstractFuncionario.java\", line 21, character 50 (models.funcionario.AbstractFuncionario.java:21)>\n";
         String evalErrorMsg = "Invalid expression in \"@post <File \"AbstractFuncionario.java\"> regarding code at \nFile \"AbstractFuncionario.java\"\nnon_null for field 'nome' <File \"models.funcionario.AbstractFuncionario.java\", line 5, character 49 (models.funcionario.AbstractFuncionario.java:5)>\nnon_null for field 'rg' <File \"models.funcionario.AbstractFuncionario.java\", line 9, character 47 (models.funcionario.AbstractFuncionario.java:9)>\nnon_null for field 'cpf' <File \"models.funcionario.AbstractFuncionario.java\", line 13, character 48 (models.funcionario.AbstractFuncionario.java:13)>\nnon_null for field 'dataNascimento' <File \"models.funcionario.AbstractFuncionario.java\", line 17, character 59 (models.funcionario.AbstractFuncionario.java:17)>\nnon_null for field 'cargo' <File \"models.funcionario.AbstractFuncionario.java\", line 21, character 50 (models.funcionario.AbstractFuncionario.java:21)>\n\nCaused by: ";
         JMLChecker.checkInvariant(rac$b, invErrorMsg, evalErrorMsg, -1, false);

       }
     }

  /** Generated by JML to enhance precondition checking */
  public static aspect UtilPreconditionChecking_AbstractFuncionario{
    declare precedence: AspectJMLRac*, UtilPreconditionChecking_AbstractFuncionario;
    before(): (execution(void models.funcionario.AbstractFuncionario.setNome(java.lang.String))
            || execution(void models.funcionario.AbstractFuncionario.setRg(java.lang.String))
            || execution(void models.funcionario.AbstractFuncionario.setCpf(java.lang.String))
            || execution(void models.funcionario.AbstractFuncionario.setDataNascimento(java.lang.String))
            || execution(void models.funcionario.AbstractFuncionario.setCargo(java.lang.String))){
      JMLChecker.hasAnyThrownPrecondition();
    }
  }

  /** Generated by JML to throw satisfied and violated predicates
    *  from multiple spec case checking (if on), and to hide specific
    *  aspect stack trace elements from error reporting. */ 
  public static aspect UtilMultipleSpecCaseCheckingAndStackTraceHiding_AbstractFuncionario{
    declare precedence: UtilMultipleSpecCaseCheckingAndStackTraceHiding_AbstractFuncionario, AspectJMLRac*;

    after() throwing (Throwable rac$e): (execution( * models.funcionario.AbstractFuncionario+.*(..))
            || execution(models.funcionario.AbstractFuncionario+.new(..))){
      JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    }
  }
}
