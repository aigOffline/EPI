int multiple(int x, int y){
	if(y == 0){
	return 0
	}
	if(y > 0){
	return x + multiple(x, y-1);
	}
	if(y < 0){
	return  -multiple(x, -y);
	}
}

