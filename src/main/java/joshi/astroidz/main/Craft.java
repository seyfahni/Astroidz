/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joshi.astroidz.main;

import static org.lwjgl.glfw.GLFW.*;
/**
 *
 * @author 
 */
 import joshi.astroidz.graphics.Shader; 
 import joshi.astroidz.graphics.Texture; 
 import joshi.astroidz.graphics.VertexArray; 
 import joshi.astroidz.input.Input; 
 import joshi.astroidz.maths.Matrix4f; 
 import joshi.astroidz.maths.Vector3f;

public class Craft {
 
   private float SIZE = 1.0f; 
 	private VertexArray mesh; 
	private Texture texture; 
        
 	private Vector3f position = new Vector3f(); 
 	private float rot; 
 	private float delta = 0.0f; 
 	 
 	public Craft() { 
 		float[] vertices = new float[] { 
 			-SIZE / 2.0f, -SIZE / 2.0f, 0.2f, 
 			-SIZE / 2.0f,  SIZE / 2.0f, 0.2f, 
 			 SIZE / 2.0f,  SIZE / 2.0f, 0.2f, 
			 SIZE / 2.0f, -SIZE / 2.0f, 0.2f 
		}; 
 			 
 		byte[] indices = new byte[] { 
 			0, 1, 2, 
 			2, 3, 0 
		}; 
 		 
		float[] tcs = new float[] { 
			0, 1, 
 			0, 0, 
			1, 0, 
 			1, 1 
 		}; 
 		 
 		mesh = new VertexArray(vertices, indices, tcs); 
 		texture = new Texture("res/space.png"); 
 	} 
 	 
 	public void update() { 
 		position.y -= delta; 
 		if (Input.isKeyDown(GLFW_KEY_SPACE))  
 			delta = -0.15f; 
 		else 
 			delta += 0.01f; 
		 
        rot = -delta * 90.0f; 
 	} 
        
 	public void fall() { 
 		delta = -0.15f; 
 	} 
 	 
 	public void render() { 
 		Shader.BIRD.enable(); 
 		Shader.BIRD.setUniformMat4f("ml_matrix", Matrix4f.translate(position).multiply(Matrix4f.rotate(rot))); 
		texture.bind(); 
		mesh.render(); 
 		Shader.BIRD.disable(); 
 	} 
 
 
 	public float getY() { 
 		return position.y; 
 	} 
 
 
 	public float getSize() { 
 		return SIZE; 
 	} 
 
 
 	 
 } 

