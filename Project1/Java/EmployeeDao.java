public interface EmployeeDao{
	
			public List<reciept> getAllReciepts();
			
			/*bear Example */
			 public List<Bear> getBears();
			 public Bear getBearById( int id);
			 public void createBear(Bear bear);
			 public void updateBear(Bear bear);
			 public void deleteBear(Bear bear); 
			 
}

public class BearDaoImpl implements BearDao{

private List<Bear> allBears = new ArrayList<>();
	
	public BearDaoImpl(){
			BearType bt - new BearType(4, "Grizzly");
			Cave c = new Cave(57, "Tampa", 12);
			//more code 
			this.allBears.add(/*parameters*/);
			this.allBears.add(/*parameters*/);
		
		public List<Bear> getBears() {
			return List<Bear>; 
		}
		
		public Bear getBearById( int id){
			Bear b = null;
			for (Bear bear : allBears){
				if (bear.getId()==(id)){
					return bear;
				}
			}
			return b; 
		}
		
		public void createBear( Bear bear){
			allBears.add(bear);
			
		}
	
}

public class BearService {
	private BearDao bd = new BearDaoImpl(); // this is the only line i have to chaneg to swap out dao implementation 
	
	public BearService()
		
	}
	public List<Bear> getBears(){
		return bd.getBears(); 
	}
	public Bear getBearById( int Id){
		return bd.getBearById(id);
		
	}
	public void createBear( Bear bear);
	bd.createBear(bear); 	
}

@WebServlet("/bear") // alternative way to register and map servlets
public class BearServlet extends HttpServlet {
	//this is our service class who's methods we will call 
	private BearService bearService;
	
	//we'll use this to convert JavaObjects to JSON-formatted data to include in reponse bodies 
	//we use Jackson to get this dependency 
	private ObjectMapper om; 
	
	public BearServlet(){
		bearService = new BearService();
		om = new ObjectMapper(); 
		om.registerModule(new JavaTimeModule());
		om.configure(SerializationFeature.wrtie_DATE_KEYS_AS_TIMESTAMPS, false);  //an emum, deals how the elements of a object are converted back and forth
	}
	
	//return all bears in JSON format
	//if no bear id is specified, otherwise return the requested bear
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//check whether there is an id provided in the query string 
		String idString = req.getParameter("id");
		if(idString != null){
		//try and find desire bear
		try{
			int id = Integer.parseInt(idString);
			String bearJSON = om.writeValueAsString(bearService.getBears(bearService.getBearById(id));
			//if object mapper gets a null value, it will be converted to a string "null" .
			if (!bearJSON.equals("null")){
				resp.getWriter().write(bearJSON);
				
			}else {
				resp.sendError(404); 
			}
		}catach (Exception e){
			resp.sendError(400, "Bad Request"); //general bad request 
		}
		} else {
		//return all bears 
		resp.getWriter().write(om.writeValueAsString(bearService.getBears())); 
	}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(bearService.createBear(om.readValue(req.getReader(), Bear.class))){
			resp.setStatus(200);
			
		}else {
			resp.setStatus(400);
		}
			}
}