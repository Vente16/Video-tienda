
 $(document).ready(function(){
     
    $('.Eliminar').click(function Eliminar(){
        
    var confirmar = confirm("¿De verdad desea eliminar esta película?");
       
       var Id = $(this).attr('value');
       
       
      if(confirmar){
          
          
           $(this).parent().parent().remove();
          $.post('Eliminar.jsp',{"Id":Id}, function(datos){

              // $('#registrar').text(datos);
              
              toastr.info(datos);
              
             

            });

           
      } 
     
       
        
    });  
    
    
   
 
    
     
 });



