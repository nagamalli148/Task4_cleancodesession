public double automatedHome(double area,String material_standard)
{
	double cost;
	if(material_standard=="standard")
	{
		cost=1200*area;
	}
	else if(material_standard=="above standard")
	{
		cost=1500*area;
	}
	else if(material_standard=="high standard")
	{
		cost=1800*area;
	}
	else
	{
		cost=2500*area;
	}
	return cost;
	
}