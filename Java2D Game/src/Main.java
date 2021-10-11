import java.lang.Object;
import javax.vecmath.Tuple3d;
import javax.vecmath.Vector3d;
public class Main {
    public static void main(String[] args) {
        float l_length = 1.0f;
        float l_height = 1.0f;
        float l_width = 1.0f;
        Vector3d blockPosition = (0.0f,0.0f,0.0f);
        pRenderer->PushMatrix();
        pRenderer->TranslateWorldMatrix(blockPosition.x, blockPosition.y, blockPosition.z);
        pRenderer->SetRenderMode(RM_SOLID);
        pRenderer->EnableImmediateMode(IM_QUADS);
        pRenderer->ImmediateColourAlpha(1.0f, 1.0f, 1.0f, 1.0f);
        pRenderer->ImmediateNormal(0.0f, 0.0f, -1.0f);
        pRenderer->ImmediateVertex(l_length, -l_height, -l_width);
        pRenderer->ImmediateVertex(-l_length, -l_height, -l_width);
        pRenderer->ImmediateVertex(-l_length, l_height, -l_width);
        pRenderer->ImmediateVertex(l_length, l_height, -l_width);
        pRenderer->ImmediateNormal(0.0f, 0.0f, 1.0f);
        pRenderer->ImmediateVertex(-l_length, -l_height, l_width);
        pRenderer->ImmediateVertex(l_length, -l_height, l_width);
        pRenderer->ImmediateVertex(l_length, l_height, l_width);
        pRenderer->ImmediateVertex(-l_length, l_height, l_width);
        pRenderer->ImmediateNormal(1.0f, 0.0f, 0.0f);
        pRenderer->ImmediateVertex(l_length, -l_height, l_width);
        pRenderer->ImmediateVertex(l_length, -l_height, -l_width);
        pRenderer->ImmediateVertex(l_length, l_height, -l_width);
        pRenderer->ImmediateVertex(l_length, l_height, l_width);
        pRenderer->ImmediateNormal(-1.0f, 0.0f, 0.0f);
        pRenderer->ImmediateVertex(-l_length, -l_height, -l_width);
        pRenderer->ImmediateVertex(-l_length, -l_height, l_width);
        pRenderer->ImmediateVertex(-l_length, l_height, l_width);
        pRenderer->ImmediateVertex(-l_length, l_height, -l_width);
        pRenderer->ImmediateNormal(0.0f, -1.0f, 0.0f);
        pRenderer->ImmediateVertex(-l_length, -l_height, -l_width);
        pRenderer->ImmediateVertex(l_length, -l_height, -l_width);
        pRenderer->ImmediateVertex(l_length, -l_height, l_width);
        pRenderer->ImmediateVertex(-l_length, -l_height, l_width);
        pRenderer->ImmediateNormal(0.0f, 1.0f, 0.0f);
        pRenderer->ImmediateVertex(l_length, l_height, -l_width);
        pRenderer->ImmediateVertex(-l_length, l_height, -l_width);
        pRenderer->ImmediateVertex(-l_length, l_height, l_width);
        pRenderer->ImmediateVertex(l_length, l_height, l_width);
        pRenderer->DisableImmediateMode();
        pRenderer->PopMatrix();
    }
}
